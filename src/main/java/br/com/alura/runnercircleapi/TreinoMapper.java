package br.com.alura.runnercircleapi;

public class TreinoMapper {
    public TreinoResponseDTO toTreinoResponseDTO(Treino treino) {
        return new TreinoResponseDTO(
                treino.getId(),
                treino.getTipoTreino(),
                treino.getTempoEmMinutos(),
                treino.getDistanciaMetros(),
                treino.getCalorias(),
                treino.getBatimentos(),
                treino.getDescricao(),
                treino.getImagemUrl(),
                treino.getDataCriacao()
        );
    }

    public Treino toEntity(TreinoResponseDTO treinoResponseDTO) {
        return new Treino();
    }

    public void atualizarEntity(Treino treino, TreinoResponseDTO treinoResponseDTO) {
        treino.setTempoEmMinutos(treinoResponseDTO.tempoEmMinutos());
    }
}
