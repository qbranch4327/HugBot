package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class HugSubsystem extends SubsystemBase {
    private final VictorSP hugController;

    public HugSubsystem(VictorSP hugController) {
        this.hugController = hugController;
    }

    public void hug() {
        hugController.set(-0.5d);
    }

    public void release() {
        hugController.set(0.2d);
    }

    public void rest() {
        hugController.set(0);
    }
}
