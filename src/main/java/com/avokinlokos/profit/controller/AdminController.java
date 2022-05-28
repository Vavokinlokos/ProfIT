package com.avokinlokos.profit.controller;

import com.avokinlokos.profit.dao.ParticipantRepository;
import com.avokinlokos.profit.model.Participant;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("admin")
@RequiredArgsConstructor
public class AdminController {
    private final ParticipantRepository participantRepository;

    @RequestMapping("show")
    public List<Participant> showParticipants() {
        return participantRepository.findAll();
    }
}
