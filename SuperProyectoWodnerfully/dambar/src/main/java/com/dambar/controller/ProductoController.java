package com.dambar.controller;
import com.dambar.domain.Producto;
import com.dambar.exceptions.ProductoNotFoundException;
import com.dambar.service.ProductoService;
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
@Tag(name="productos", description = "Lista de productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @Operation(summary = "Obtiene la lista de productos")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Listado de productos",
                    content = @Content(array = @ArraySchema(schema = @Schema(implementation = Producto.class)))),
    })
    @GetMapping(value = "/productos", produces = "application/json")
    public ResponseEntity<Set<Producto>> getproductos(){
        Set<Producto> productos = productoService.findAll();
        return new ResponseEntity<>(productos, HttpStatus.OK);
    }

    @Operation(summary = "Obtiene ua lista de productos filtrados por su tipo")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Existe el producto", content = @Content(schema = @Schema(implementation = Producto.class))),
            @ApiResponse(responseCode = "404", description = "El producto no existe", content = @Content(schema = @Schema(implementation = Response.class))),
    })
    @GetMapping(value = "/productos/{tipo}", produces = "application/json")
    public ResponseEntity<Set<Producto>> getproductosByTipo(@PathVariable String tipo){
        Set<Producto> productos = productoService.findByTipo(tipo);
        return new ResponseEntity<>(productos, HttpStatus.OK);
    }

    @Operation(summary = "Obtiene un producto determinado")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Existe el producto", content = @Content(schema = @Schema(implementation = Producto.class))),
            @ApiResponse(responseCode = "404", description = "El producto no existe", content = @Content(schema = @Schema(implementation = Response.class))),
    })
    @GetMapping(value = "/productos/{id}", produces = "application/json")
    public ResponseEntity<Producto> getProducto(@PathVariable long id) {
        Producto producto = productoService.findById(id)
                .orElseThrow(() -> new ProductoNotFoundException(id));
        return new ResponseEntity<>(producto, HttpStatus.OK);
    }

    @Operation(summary = "Registra un nueva producto")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se registra el producto", content = @Content(schema = @Schema(implementation = Producto.class))),
    })
    @PostMapping(value = "/productos", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Producto> addProducto(@RequestBody Producto producto) {
        Producto addedProducto = productoService.addProducto(producto);
        return new ResponseEntity<>(addedProducto, HttpStatus.OK);
    }

    @Operation(summary = "Modifica un producto de la lista")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se modifica el producto", content = @Content(schema = @Schema(implementation = Producto.class))),
            @ApiResponse(responseCode = "404", description = "El producto no existe", content = @Content(schema = @Schema(implementation = Response.class))),
    })
    @PutMapping(value = "/productos/{id}", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Producto> modifyproducto(@PathVariable long id, @RequestBody Producto newProducto) {
        Producto producto = productoService.modifyProducto(id, newProducto);
        return new ResponseEntity<>(producto, HttpStatus.OK);
    }

    @Operation(summary = "Elimina un producto")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Se elimina el producto", content = @Content(schema = @Schema(implementation = Response.class))),
            @ApiResponse(responseCode = "404", description = "El producto no existe", content = @Content(schema = @Schema(implementation = Response.class))),
    })
    @DeleteMapping(value = "/productos/{id}", produces = "application/json")
    public ResponseEntity<Response> deleteProducto(@PathVariable long id)
    {
        productoService.deleteProducto(id);
        return new ResponseEntity<>(Response.noErrorResponse(), HttpStatus.OK);
    }
}
