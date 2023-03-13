package Interfaces_And_Abstraction.Exercise.MilitaryElite.interfaces;

import Interfaces_And_Abstraction.Exercise.MilitaryElite.enums.MissionState;

public interface Mission {
    String getCodeName();
    MissionState getState();
    void completeMission();
}
