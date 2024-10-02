package org.example.qtalk.Service;

import org.example.qtalk.Entity.QualificationEntity;
import org.example.qtalk.Repository.DibsRepository;
import org.example.qtalk.Repository.QualificationRepository;
import org.example.qtalk.dto.QualificationDTO;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class DibsService {

    private final DibsRepository dibsRepository;
    private final QualificationRepository qualificationRepository;

    public DibsService(DibsRepository dibsRepository, QualificationRepository qualificationRepository) {
        this.dibsRepository = dibsRepository;
        this.qualificationRepository = qualificationRepository;
    }

    // 검색기능
    public QualificationDTO getQualificationInfo(String qualificationName) {

        QualificationEntity qualificationEntity = qualificationRepository.findByName(qualificationName);
        QualificationDTO qualificationDTO = new QualificationDTO();
        qualificationDTO.setQualificationId(qualificationEntity.getId());
        qualificationDTO.setType(qualificationEntity.getType());
        return qualificationDTO;
    }


}

