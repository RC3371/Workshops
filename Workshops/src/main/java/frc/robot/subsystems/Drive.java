package frc.subsystems;

import java.util.Scanner;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.*;


public abstract class Drive {
    TalonSRX talonLF = new TalonSRX(0);
    TalonSRX talonLB = new TalonSRX(1);
    TalonSRX talonRF = new TalonSRX(2);
    TalonSRX talonRB = new TalonSRX(3);
    
    int pidIdx = 0;
    int timeoutMs = 0;

    public void setTalonLB(TalonSRX talonLB) {
        this.talonLB = talonLB;
        talonLB.set(ControlMode.Follower, 0);
    }

    public void setTalonRB(TalonSRX talonRB) {
        this.talonRB = talonRB;
        talonLB.set(ControlMode.Follower, 0);
    }

    public void setTalonLF(TalonSRX talonLF) {
        this.talonLF = talonLF;
        talonLF.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative,  0, 1000);
    }

    public void setTalonRF(TalonSRX talonRF) {
        this.talonRF = talonRF;
        talonRF.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative,  0, 1000);
    }

    
}
