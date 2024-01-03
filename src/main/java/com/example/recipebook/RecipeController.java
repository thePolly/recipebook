package com.example.recipebook;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/recipes")
public class RecipeController {


    @Autowired
    private RecipeService recipeService;

    @GetMapping
    public ResponseEntity <List<Recipe>> allRecipes(){
       return new ResponseEntity<>(recipeService.allRecipes(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Recipe>> getRecipeById(@PathVariable ObjectId id){
        return new ResponseEntity<>(recipeService.singleRecipe(id), HttpStatus.OK);
    }


    @PostMapping("/post")
    public Recipe addRecipe(@RequestBody Recipe recipe){
        return recipeService.addRecipe(recipe);
    }
}
