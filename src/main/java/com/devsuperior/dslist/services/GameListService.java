package com.devsuperior.dslist.services;


import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GameListService {

    private GameListRepository gameListRepository;

    @Autowired
    public GameListService(GameListRepository gameListRepository) {
        this.gameListRepository = gameListRepository;
    }

    public GameListService() {
    }

    /**
     * Método para buscar todas as listas de jogos
     *
     * @return retorna todas as listas
     */
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        return gameListRepository.findAll().stream().map(gameList -> new GameListDTO(gameList)).toList();
    }

    @Transactional(readOnly = true)
    public Optional<GameListDTO> findById(Long id) {
        return gameListRepository.findById(id).map(gameList -> new GameListDTO(gameList));
    }
}
