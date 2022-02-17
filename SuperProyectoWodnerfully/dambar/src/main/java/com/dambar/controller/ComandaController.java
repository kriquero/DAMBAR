package com.dambar.controller;

import com.dambar.domain.Camarero;
import com.dambar.domain.Comanda;
import com.dambar.domain.LineaComanda;
import com.dambar.exceptions.ComandaNotFoundException;
import com.dambar.service.ComandaService;
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

import java.util.Optional;
import java.util.Set;

@RestController
@Tag(name="comanda", description = "Lista de comandas")
public class ComandaController {

    @Autowired
    private ComandaService comandaService;

    @Operation(summary = "Obtiene la lista de comandas")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Listado de comandas",
                    content = @Content(array = @ArraySchema(schema = @Schema(implementation = Comanda.class)))),
    })
    @GetMapping(value = "/comandas", produces = "application/json")
    public ResponseEntity<Set<Comanda>> getComanda(){
        Set<Comanda> comandas =  comandaService.findAll();
        return new ResponseEntity<>(comandas, HttpStatus.OK);
    }

    @Operation(summary = "Obtiene una comanda determinado")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Existe la comanda", content = @Content(schema = @Schema(implementation = Comanda.class))),
            @ApiResponse(responseCode = "404", description = "La comanda no existe", content = @Content(schema = @Schema(implementation = Response.class))),
    })
    @GetMapping(value = "/comandas/{id}", produces = "application/json")
    public ResponseEntity<Comanda> getComanda(@PathVariable long id) {
        Comanda comanda = comandaService.findById(id)
                .orElseThrow(() -> new ComandaNotFoundException(id));
        return new ResponseEntity<>(comanda, HttpStatus.OK);
    }

    @Operation(summary = "Registra una nueva comanda")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se registra la comanda", content = @Content(schema = @Schema(implementation = Comanda.class))),
    })
    @PostMapping(value = "/comandas", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Comanda> addComanda(@RequestBody Comanda comanda) {
        Comanda addedComanda = comandaService.addComanda(comanda);
        return new ResponseEntity<>(addedComanda, HttpStatus.OK);
    }

    @Operation(summary = "Modifica una comanda de la lista")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se modifica la comanda", content = @Content(schema = @Schema(implementation = Comanda.class))),
            @ApiResponse(responseCode = "404", description = "La comanda no existe", content = @Content(schema = @Schema(implementation = Response.class))),
    })
    @PutMapping(value = "/comandas/{id}", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Comanda> modifyComanda(@PathVariable long id, @RequestBody Comanda newComanda) {
        Comanda comanda = comandaService.modifyComanda(id, newComanda);
        return new ResponseEntity<>(comanda, HttpStatus.OK);
    }

    @Operation(summary = "Elimina una comanda")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se elimina la comanda", content = @Content(schema = @Schema(implementation = Response.class))),
            @ApiResponse(responseCode = "404", description = "La comanda no existe", content = @Content(schema = @Schema(implementation = Response.class))),
    })
    @DeleteMapping(value = "/comandas/{id}", produces = "application/json")
    public ResponseEntity<Response> deleteComanda(@PathVariable long id)
    {
        comandaService.deleteComanda(id);
        return new ResponseEntity<>(Response.noErrorResponse(), HttpStatus.OK);
    }

    @Operation(summary = "Modifica una linea de comanda de la comanda")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se modifica la comanda", content = @Content(schema = @Schema(implementation = Comanda.class))),
            @ApiResponse(responseCode = "404", description = "La comanda no existe", content = @Content(schema = @Schema(implementation = Response.class))),
    })
    @PutMapping(value = "/comandas/addLinea/{id}", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Comanda> addLineaComanda(@PathVariable long id, @RequestBody LineaComanda linea) {
        Comanda comanda = comandaService.addLinea(id, linea);
        return new ResponseEntity<>(comanda, HttpStatus.OK);
    }

    @Operation(summary = "Elimina una linea de comanda de la comanda")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se modifica la comanda", content = @Content(schema = @Schema(implementation = Comanda.class))),
            @ApiResponse(responseCode = "404", description = "La comanda no existe", content = @Content(schema = @Schema(implementation = Response.class))),
    })
    @PutMapping(value = "/comandas/{idC}/deleteLinea/{idL}", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Comanda> deleteLineaComanda(@PathVariable long idC, @PathVariable long idL) {
        Comanda comanda = comandaService.deleteLinea(idC, idL);
        return new ResponseEntity<>(comanda, HttpStatus.OK);
    }

    @Operation(summary = "Añade un camarero a la comanda")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se modifica la comanda", content = @Content(schema = @Schema(implementation = Comanda.class))),
            @ApiResponse(responseCode = "404", description = "La comanda no existe", content = @Content(schema = @Schema(implementation = Response.class))),
    })
    @PutMapping(value = "/comandas/addCamarero/{id}", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Comanda> addCamarero(@PathVariable long id, @RequestBody Camarero camarero) {
        Comanda comanda = comandaService.addCamarero(id, camarero);
        return new ResponseEntity<>(comanda, HttpStatus.OK);
    }

    @Operation(summary = "Elimina el camarero de la comanda")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se modifica la comanda", content = @Content(schema = @Schema(implementation = Comanda.class))),
            @ApiResponse(responseCode = "404", description = "La comanda no existe", content = @Content(schema = @Schema(implementation = Response.class))),
    })
    @PutMapping(value = "/comandas/{idCo}/eliminareCamarero", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Comanda> deleteCamarero(@PathVariable long idCo) {
        Comanda comanda = comandaService.deleteCamarero(idCo);
        return new ResponseEntity<>(comanda, HttpStatus.OK);
    }

    @Operation(summary = "Obtiene la lista de lineas de la comanda")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Listado de comandas",
                    content = @Content(array = @ArraySchema(schema = @Schema(implementation = Comanda.class)))),
    })
    @GetMapping(value = "/comandas/lineas/{id}", produces = "application/json")
    public ResponseEntity<Set<LineaComanda>> getLineasComanda(@PathVariable long id){
        Comanda comanda =  comandaService.findById(id).orElseThrow(() -> new ComandaNotFoundException(id));
        Set<LineaComanda> lineasComanda = comanda.getLineasComanda();
        return new ResponseEntity<>(lineasComanda, HttpStatus.OK);
    }


}
