package com.dambar.controller;

import com.dambar.domain.LineaComanda;
import com.dambar.exceptions.LineaComandaNotFoundException;
import com.dambar.service.LineaComandaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@Tag(name="lineasDeComanda", description = "Lista de las lineas de comanda")
public class LineaComandaController {

    @Autowired
    private LineaComandaService lineaService;

    @Operation(summary = "obtiene la lista de lineas de comandas")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Listado de lineas de comandas",
                    content = @Content(array = @ArraySchema(schema = @Schema(implementation = LineaComanda.class)))),
    })
    @GetMapping(value = "/lineas", produces = "application/json")
    public ResponseEntity<Set<LineaComanda>> getlineas(){
        Set<LineaComanda> lineas = lineaService.findAll();
        return new ResponseEntity<>(lineas, HttpStatus.OK);
    }

    @Operation(summary = "Obtiene una linea de comanda determinada")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Existe la linea de comanda", content = @Content(schema = @Schema(implementation = LineaComanda.class))),
            @ApiResponse(responseCode = "404", description = "La linea de comanda no existe", content = @Content(schema = @Schema(implementation = Response.class))),
    })
    @GetMapping(value = "/lineas/{id}", produces = "application/json")
    public ResponseEntity<LineaComanda> getLinea(@PathVariable long id) {
        LineaComanda linea = lineaService.findById(id)
                .orElseThrow(() -> new LineaComandaNotFoundException(id));
        return new ResponseEntity<>(linea, HttpStatus.OK);
    }

    @Operation(summary = "Registra una nueva linea de comanda")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se registra la linea", content = @Content(schema = @Schema(implementation = LineaComanda.class))),
    })
    @PostMapping(value = "/lineas", produces = "application/json", consumes = "application/json")
    public ResponseEntity<LineaComanda> addLinea(@RequestBody LineaComanda linea) {
        LineaComanda addedlinea = lineaService.addLineaComanda(linea);
        return new ResponseEntity<>(addedlinea, HttpStatus.OK);
    }

    @Operation(summary = "Modifica una linea de comanda de la lista")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se modifica la linea de comanda", content = @Content(schema = @Schema(implementation = LineaComanda.class))),
            @ApiResponse(responseCode = "404", description = "La linea de comanda no existe", content = @Content(schema = @Schema(implementation = Response.class))),
    })
    @PutMapping(value = "/lineas/{id}", produces = "application/json", consumes = "application/json")
    public ResponseEntity<LineaComanda> modifyLinea(@PathVariable long id, @RequestBody LineaComanda newLinea) {
        LineaComanda linea = lineaService.modifyLineaComanda(id, newLinea);
        return new ResponseEntity<>(linea, HttpStatus.OK);
    }

    @Operation(summary = "Elimina una linea de comanda")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se elimina la linea de comanda", content = @Content(schema = @Schema(implementation = Response.class))),
            @ApiResponse(responseCode = "404", description = "La linea de comanda no existe", content = @Content(schema = @Schema(implementation = Response.class))),
    })
    @DeleteMapping(value = "/lineas/{id}", produces = "application/json")
    public ResponseEntity<Response> deleteLinea(@PathVariable long id)
    {
        lineaService.deleteLineaComanda(id);
        return new ResponseEntity<>(Response.noErrorResponse(), HttpStatus.OK);
    }
}
