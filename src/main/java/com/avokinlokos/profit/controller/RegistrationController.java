package com.avokinlokos.profit.controller;

import com.avokinlokos.profit.dao.ParticipantRepository;
import com.avokinlokos.profit.model.Participant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("registration")
@RequiredArgsConstructor
public class RegistrationController {

    private final ParticipantRepository participantRepository;

    @RequestMapping(method = RequestMethod.GET)
    private String showForm(Participant participant) {
        return "registration";
    }

    @RequestMapping(method = RequestMethod.POST)
    private String register(Participant participant, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "registration";
        }

        participantRepository.save(participant);

        return "success";
    }
}
