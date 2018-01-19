/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

import chainofresponsibility.mir00r.handler.RequestHandler;
import chainofresponsibility.mir00r.model.Employee;
import chainofresponsibility.mir00r.service.IApprover;
import chainofresponsibility.mir00r.service_implemnet.ProjectManager;
import chainofresponsibility.mir00r.service_implemnet.ResourceManager;
import chainofresponsibility.mir00r.service_implemnet.TeamLeader;
import chainofresponsibility.mir00r.utility.Constant;
import chainofresponsibility.mir00r.utility.Constant.Response;
import java.util.Scanner;

/**
 *
 * @author Created by Mir00r
 */
public class ChainOfResponsibility {

    private static IApprover CreateChain() {
        IApprover handler = new RequestHandler();

        IApprover approver1 = new TeamLeader();
        IApprover approver2 = new ProjectManager();
        IApprover approver3 = new ResourceManager();

        handler.NextLeaveApprover(approver1);
        approver1.NextLeaveApprover(approver2);
        approver2.NextLeaveApprover(approver3);

        return handler;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next();
        String gender = s.next();
        int days = s.nextInt();

        Employee employee = new Employee(name, gender, days);

//        IApprover approver = new TeamLeader();
//        Response responses = approver.LeaveApprove(employee);
        IApprover handler = CreateChain();
        Response responses = handler.LeaveApprove(employee);

        if (Response.APPROVED == responses) {
            if (employee.getGender().equalsIgnoreCase(Constant.GENDER.MALE.toString())) {
                System.out.println("Request Granted Have A nice journey Mr: " + employee.getName());
            } else {
                System.out.println("Request Granted Have A nice journey Mrs/Miss: " + employee.getName());
            }
        } else if (Response.DENIED == responses) {
            if (employee.getGender().equalsIgnoreCase(Constant.GENDER.MALE.toString())) {
                System.out.println("Sorry Your Request was not granted  Mr: " + employee.getName());
            } else {
                System.out.println("Sorry Your Request was not granted  Mrs/Miss: " + employee.getName());
            }
        }

//        if (Response.APPROVED != responses) {
//            approver = new ProjectManager();
//            responses = approver.LeaveApprove(employee);
//            if (Response.APPROVED == responses) {
//                if (employee.getGender() == Constant.GENDER.MALE.toString()) {
//                    System.out.println("Request Granted Have A nice journey Mr: " + employee.getName());
//                } else {
//                    System.out.println("Request Granted Have A nice journey Mrs/Miss: " + employee.getName());
//                }
//            } else {
//                if (employee.getGender() == Constant.GENDER.MALE.toString()) {
//                    System.out.println("Sorry Your Request was not granted  Mr: " + employee.getName());
//                } else {
//                    System.out.println("Sorry Your Request was not granted  Mrs/Miss: " + employee.getName());
//                }
//            }
//        } else {
//            if (employee.getGender() == Constant.GENDER.MALE.toString()) {
//                System.out.println("Request Granted Have A nice journey Mr: " + employee.getName());
//            } else {
//                System.out.println("Request Granted Have A nice journey Mrs/Miss: " + employee.getName());
//            }
//        }
    }
}
