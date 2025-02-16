package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class GameService {

    private final GameRepository gameRepository;

    // Implementar a injeção de dependência através do construtor para facilitar testes
    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    /**
     * Método para buscar todos os jogos da lista
     * @return retorna uma lista com todos os jogos
     * */
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).collect(Collectors.toList());
    }

    /**
     * Método para buscar por Id
     * @param id id do jogo a ser buscado
     * @return retorna um game a lista
     */
    public Optional<GameDTO> findById(Long id) {
     return gameRepository.findById(id).map(GameDTO::new);
    }





}
