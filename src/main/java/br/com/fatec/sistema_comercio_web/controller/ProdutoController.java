package br.com.fatec.sistema_comercio_web.controller;

import br.com.fatec.sistema_comercio_web.model.Cliente;
import br.com.fatec.sistema_comercio_web.model.Produto;
import br.com.fatec.sistema_comercio_web.service.ProdutoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoService service;

    public ProdutoController(
            ProdutoService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("produtos", service.listar());
        return "produtos/lista";
    }
    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("produto", new Produto());
        return "produtos/formulario";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Produto produto) {
        service.cadastrar(produto);
        return "redirect:/produtos";
    }

}
