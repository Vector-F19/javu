package com.mapas.apiRest.repository;

import com.mapas.apiRest.models.Mapa;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
public class FindMapaByParansRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Mapa> findByParametter(Mapa mapa) {


        StringBuilder strQuery = new StringBuilder("SELECT m FROM Mapa m where 1 = 1 ");
        Map<String, Object> values = new HashMap<>();

        Optional.ofNullable(mapa.getFluxo())
                .map(v -> v.trim())
                .filter(f -> !f.isEmpty())
                .ifPresent(fluxo -> {
                    strQuery.append(" and upper( fluxo) like upper(:fluxo)");
                    values.put("fluxo", "%" + fluxo + "%");

                });

        Optional.ofNullable(mapa.getProduto())
                .map(v -> v.trim())
                .filter(f -> !f.isEmpty())
                .ifPresent(produto -> {
                    strQuery.append(" and upper( produto) like upper(:produto)");
                    values.put("produto","%" + produto + "%");

                });

        Optional.ofNullable(mapa.getBancoEntrada())
                .map(v -> v.trim())
                .filter(f -> !f.isEmpty())
                .ifPresent(bancoEntrada -> {
                    strQuery.append(" and upper( bancoEntrada) like upper(:bancoEntrada) ");
                    values.put("bancoEntrada","%" + bancoEntrada + "%");

                });

       Optional.ofNullable(mapa.getBancoSaida())
               .map(v -> v.trim())
               .filter(f -> !f.isEmpty())
                .ifPresent(bancoSaida -> {
                    strQuery.append(" and upper( bancoSaida) like upper(:bancoSaida) ");
                    values.put("bancoSaida","%" + bancoSaida + "%");

                });

        TypedQuery<Mapa> query = entityManager.createQuery(strQuery.toString(), Mapa.class);
        values.forEach((key, value) -> query.setParameter(key, value));
        return query.getResultList();
    }
}

