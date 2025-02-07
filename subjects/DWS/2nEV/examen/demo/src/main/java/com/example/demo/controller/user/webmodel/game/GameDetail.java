package com.example.demo.controller.user.webmodel.game;

import com.example.demo.controller.user.webmodel.character.CharacterCollection;
import com.example.demo.controller.user.webmodel.director.DirectorCollection;

public record GameDetail(
                String id,
                String game_code,
                String title,
                Integer release_year,
                String description,
                CharacterCollection characters,
                DirectorCollection directors) {
}
