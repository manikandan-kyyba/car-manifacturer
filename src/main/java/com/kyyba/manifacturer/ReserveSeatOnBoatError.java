package com.kyyba.manifacturer;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named
public class ReserveSeatOnBoatError implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        String color;
        color = (String) delegateExecution.getVariable("color");

        String bodyType;
        bodyType = (String) delegateExecution.getVariable("bodyType");

        boolean isHighPrice;

        if (bodyType.equalsIgnoreCase("Sedan")) {
            isHighPrice = true;
        } else if (bodyType.equalsIgnoreCase("Hatchback")) {
            isHighPrice = false;
        } else  {
            throw new BpmnError("Fall_Overboard", "Unknown Body Type");
        }

        delegateExecution.setVariable("isHighPrice", isHighPrice);

    }
}
