package com.devsuperior.dslist.dto;


import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer gameYears;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        gameYears = entity.getGameYears();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        gameYears = projection.getYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();

    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getGameYears() {
        return gameYears;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
