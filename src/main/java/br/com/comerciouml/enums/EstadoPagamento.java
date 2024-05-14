package br.com.comerciouml.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum EstadoPagamento {

    PENDENTE(1,"Pendente"),
    QUITADO(2,"Quitado"),
    CANCELADO(3,"Cancelado");

    private int cod;
    private String descricao;

    public static EstadoPagamento toEnum(Integer id) {
        if (id == null) {
            return null;
        }
        for (EstadoPagamento x : EstadoPagamento.values()) {
            if (id.equals(x.getCod())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Id inválido " + id);
    }

}
