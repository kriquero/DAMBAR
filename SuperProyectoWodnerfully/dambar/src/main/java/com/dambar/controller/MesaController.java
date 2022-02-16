package com.dambar.controller;

import com.dambar.domain.Comanda;
import com.dambar.domain.Mesa;
import com.dambar.exceptions.MesaNotFoundException;
import com.dambar.service.ComandaService;
import com.dambar.service.MesaService;
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

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@Tag(name="mesas", description = "Lista de mesas")
public class MesaController {

    @Autowired
    private MesaService mesaService;

    @Autowired
    private ComandaService comandaService;

    @Operation(summary = "Obtiene la lista de mesas")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Listado de mesas",
            content = @Content(array = @ArraySchema(schema = @Schema(implementation = Mesa.class)))),
    })
    @GetMapping(value = "/mesas", produces = "application/json")
    public ResponseEntity<Set<Mesa>> getMesas(){
        Set<Mesa> mesas =  mesaService.findAll();
        return new ResponseEntity<>(mesas, HttpStatus.OK);
    }

    @Operation(summary = "Obtiene una mesa determinado")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Existe la mesa", content = @Content(schema = @Schema(implementation = Mesa.class))),
            @ApiResponse(responseCode = "404", description = "La mesa no existe", content = @Content(schema = @Schema(implementation = Response.class))),
    })
    @GetMapping(value = "/mesas/{id}", produces = "application/json")
    public ResponseEntity<Mesa> getMesa(@PathVariable long id) {
        Mesa mesa = mesaService.findById(id)
                .orElseThrow(() -> new MesaNotFoundException(id));
        return new ResponseEntity<>(mesa, HttpStatus.OK);
    }

    @Operation(summary = "Registra una nueva mesa")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se registra la mesa", content = @Content(schema = @Schema(implementation = Mesa.class))),
    })
    @PostMapping(value = "/mesas", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Mesa> addMesa(@RequestBody Mesa mesa) {
        Mesa addedMesa = mesaService.addMesa(mesa);
        return new ResponseEntity<>(addedMesa, HttpStatus.OK);
    }

    @Operation(summary = "Modifica una mesa de la lista")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se modifica la mesa", content = @Content(schema = @Schema(implementation = Mesa.class))),
            @ApiResponse(responseCode = "404", description = "La mesa no existe", content = @Content(schema = @Schema(implementation = Response.class))),
    })
    @PutMapping(value = "/mesas/{id}", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Mesa> modifyMesa(@PathVariable long id, @RequestBody Mesa newMesa) {
        Mesa mesa = mesaService.modifyMesa(id, newMesa);
        return new ResponseEntity<>(mesa, HttpStatus.OK);
    }

    @Operation(summary = "Elimina una mesa")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se elimina la mesa", content = @Content(schema = @Schema(implementation = Response.class))),
            @ApiResponse(responseCode = "404", description = "La mesa no existe", content = @Content(schema = @Schema(implementation = Response.class))),
    })
    @DeleteMapping(value = "/mesas/{id}", produces = "application/json")
    public ResponseEntity<Response> deleteMesa(@PathVariable long id)
    {
        mesaService.deleteMesa(id);
        return new ResponseEntity<>(Response.noErrorResponse(), HttpStatus.OK);
    }

    @Operation(summary = "Obtiene las comandas de una mesa determinada")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Existe la mesa", content = @Content(schema = @Schema(implementation = Mesa.class))),
            @ApiResponse(responseCode = "404", description = "La mesa no existe", content = @Content(schema = @Schema(implementation = Response.class))),
    })
    @GetMapping(value = "/mesas/{id}/comandas", produces = "application/json")
    public ResponseEntity<List<Comanda>> getComandasMesa(@PathVariable long id) {
        Mesa mesa = mesaService.findById(id)
                .orElseThrow(() -> new MesaNotFoundException(id));
        return new ResponseEntity<>(mesa.getComandas(), HttpStatus.OK);
    }

    @Operation(summary = "Añade una comanda de la mesa")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se modifica la mesa", content = @Content(schema = @Schema(implementation = Mesa.class))),
            @ApiResponse(responseCode = "404", description = "La mesa no existe", content = @Content(schema = @Schema(implementation = Response.class))),
    })
    @PutMapping(value = "/mesas/addComanda/{id}", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Mesa> addComanda(@PathVariable long id, @RequestBody Comanda comanda) {
        Mesa mesa = mesaService.addComanda(id, comanda);
        return new ResponseEntity<>(mesa, HttpStatus.OK);
    }

    @Operation(summary = "Añade una comanda de la mesa")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se modifica la mesa", content = @Content(schema = @Schema(implementation = Mesa.class))),
            @ApiResponse(responseCode = "404", description = "La mesa no existe", content = @Content(schema = @Schema(implementation = Response.class))),
    })
    @PutMapping(value = "/mesas/{idM}/eliminaComanda/{idC}", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Mesa> deleteConmanda(@PathVariable long idM, @PathVariable long idC) {
        Mesa mesa = mesaService.deleteComanda(idM, idC);
        return new ResponseEntity<>(mesa, HttpStatus.OK);
    }

}
