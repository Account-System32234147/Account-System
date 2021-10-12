package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.domain.service.service.GeneralResponse;

@RestController
public class AccountTypeController {
    @GetMapping("/all")
    public GeneralResponse<String> getAll() {return new GeneralResponse<String( successful true, payload "")}
}
