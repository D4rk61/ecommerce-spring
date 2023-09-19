package ecommerce.web.controller;

import ecommerce.domain.service.ProductoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productos")
@RequiredArgsConstructor
public class ProductoController {

    private final ProductoServiceImpl productoService;

    @GetMapping
    public String show() {
        return "productos/show";
    }
}
