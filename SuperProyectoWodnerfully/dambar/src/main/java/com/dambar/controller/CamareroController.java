package com.dambar.controller;

import com.dambar.domain.Camarero;
import com.dambar.exceptions.CamareroNotFoundException;
import com.dambar.service.CamareroService;
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
@Tag(name="camarero", description = "Lista de camareros")
public class CamareroController {

    @Autowired
    private CamareroService CamareroService;

    @Operation(summary = "Obtiene la lista de camareros")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Listado de camareros",
                    content = @Content(array = @ArraySchema(schema = @Schema(implementation = Camarero.class)))),
    })
    @GetMapping(value = "/camareros", produces = "application/json")
    public ResponseEntity<Set<Camarero>> getCamareros(){
        Set<Camarero> camareros =  CamareroService.findAll();
        return new ResponseEntity<>(camareros, HttpStatus.OK);
    }

    @Operation(summary = "Obtiene un camarero determinado")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Existe el camarero", content = @Content(schema = @Schema(implementation = Camarero.class))),
            @ApiResponse(responseCode = "404", description = "El camarero no existe", content = @Content(schema = @Schema(implementation = Response.class))),
    })
    @GetMapping(value = "/camareros/{id}", produces = "application/json")
    public ResponseEntity<Camarero> getCamarero(@PathVariable long id) {
        Camarero camarero = CamareroService.findById(id)
                .orElseThrow(() -> new CamareroNotFoundException(id));
        return new ResponseEntity<>(camarero, HttpStatus.OK);
    }

    @Operation(summary = "Registra un nuevo camarero")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se registra el camarero", content = @Content(schema = @Schema(implementation = Camarero.class))),
    })
    @PostMapping(value = "/camareros", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Camarero> addCamarero(@RequestBody Camarero camarero) {
        Camarero addedCamarero = CamareroService.addCamarero(camarero);
        return new ResponseEntity<>(addedCamarero, HttpStatus.OK);
    }

    @Operation(summary = "Modifica un camarero de la lista")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se modifica el camarero", content = @Content(schema = @Schema(implementation = Camarero.class))),
            @ApiResponse(responseCode = "404", description = "El Camarero no existe", content = @Content(schema = @Schema(implementation = Response.class))),
    })
    @PutMapping(value = "/camareros/{id}", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Camarero> modifyCamarero(@PathVariable long id, @RequestBody Camarero newCamarero) {
        Camarero camarero = CamareroService.modifyCamarero(id, newCamarero);
        return new ResponseEntity<>(camarero, HttpStatus.OK);
    }

    @Operation(summary = "Elimina un camarero")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se elimina el camarero", content = @Content(schema = @Schema(implementation = Response.class))),
            @ApiResponse(responseCode = "404", description = "El camarero no existe", content = @Content(schema = @Schema(implementation = Response.class))),
    })
    @DeleteMapping(value = "/camareros/{id}", produces = "application/json")
    public ResponseEntity<Response> deleteCamarero(@PathVariable long id)
    {
        CamareroService.deleteCamarero(id);
        return new ResponseEntity<>(Response.noErrorResponse(), HttpStatus.OK);
    }
}
