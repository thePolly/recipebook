package com.example.recipebook;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "recipes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recipes {

    @Id
    private ObjectId id;

    private String name;

    private List<String> ingredients;


    private Integer time;


    private boolean isGlutenFree;
    private boolean isSugarFree;

    private boolean isVegetarian;

    private String img;

}
