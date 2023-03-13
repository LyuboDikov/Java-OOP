package Interfaces_And_Abstraction.Exercise.MilitaryElite.models;

import Interfaces_And_Abstraction.Exercise.MilitaryElite.enums.MissionState;
import Interfaces_And_Abstraction.Exercise.MilitaryElite.interfaces.Mission;

public class MissionImpl implements Mission {
    private String codeName;
    private MissionState missionState;

    public MissionImpl(String codeName, MissionState missionState) {
        this.codeName = codeName;
        this.missionState = missionState;
    }

    @Override
    public String getCodeName() {
        return this.codeName;
    }

    @Override
    public MissionState getState() {
        return this.getState();
    }

    @Override
    public void completeMission() {
        this.missionState = MissionState.finished;
    }
}
