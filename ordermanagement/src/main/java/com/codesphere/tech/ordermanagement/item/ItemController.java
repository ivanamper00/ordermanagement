package com.codesphere.tech.ordermanagement.item;

import com.codesphere.tech.ordermanagement.util.AppConstants;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.codesphere.tech.ordermanagement.util.AppConstants.*;

@RestController
@RequestMapping(
        path = API_PATH + API_VERSION
)
public class ItemController {
    public static final String PATH = "items";


    public List<Item> getItems(){

    }
}
