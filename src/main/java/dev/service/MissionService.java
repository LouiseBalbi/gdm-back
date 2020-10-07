package dev.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.domain.Mission;
import dev.repository.MissionRepository;

@Service
public class MissionService {

	private MissionRepository missionRepossitory;

	public MissionService(MissionRepository missionRepossitory) {
		this.missionRepossitory = missionRepossitory;
	}

	public List<Mission> getList() {

		return missionRepossitory.findAll();
	}

}