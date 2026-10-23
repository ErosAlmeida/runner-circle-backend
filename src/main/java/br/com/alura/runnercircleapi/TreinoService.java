package br.com.alura.runnercircleapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TreinoService {

    @Autowired
    private TreinoRepository treinoRepository;

    public List<Treino> findByTipoTreino(TipoTreino tipoTreino) {
        List<Treino> treinos = new ArrayList<>();

        if (tipoTreino != null) {
            treinos = treinos.stream().filter(treino -> treino.getTipoTreino() == tipoTreino).collect(Collectors.toList());
        }
        return treinos;
    }

    public Optional<Treino> findById(Long idTreino) {return treinoRepository.findById(idTreino);}

    public Treino create(Treino treino) {
        return treinoRepository.save(treino);
    }
    public Treino update(Treino treino) {
        return treinoRepository.save(treino);

    }
    public void delete(Long idTreino) {
        treinoRepository.deleteById(idTreino);
    }

}
