package com.kyyba.manifacturer;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named
public class ReserveSeatOnBoat implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        Boolean isOEM;
        isOEM = (Boolean) delegateExecution.getVariable("isOEM");

        String step;
        step = (String) delegateExecution.getVariable("step");

        System.out.println("isOEM: " + isOEM + " " + step);
        boolean isHighPrice = false;

//        if (bodyType.equalsIgnoreCase("Sedan")) {
//            isHighPrice = true;
//        } else if (bodyType.equalsIgnoreCase("Hatchback")) {
//            isHighPrice = false;
//        }

        delegateExecution.setVariable("isHighPrice", isHighPrice);
    }
}
