package com.example.recipebook;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "recipes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {

    @Id
    private ObjectId id;

    private String name;

    private List<String> ingredients;

    private Integer time;

    private String img;

    private boolean isGlutenFree;
    private boolean isSugarFree;
    private boolean isVegetarian;
    @DocumentReference
    private List<Ingredient> ingredientList;

}
