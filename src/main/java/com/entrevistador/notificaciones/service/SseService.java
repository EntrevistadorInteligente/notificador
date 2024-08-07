package com.entrevistador.notificaciones.service;

import com.entrevistador.notificaciones.dto.NotifiacionDto;
import org.springframework.http.codec.ServerSentEvent;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SseService {
    Mono<Void> generarNotificacion(String userId, NotifiacionDto notifiacion);
    Flux<ServerSentEvent<String>> getEventStream(String userId);
    Mono<Void> removeUserSink(String userId);
}
