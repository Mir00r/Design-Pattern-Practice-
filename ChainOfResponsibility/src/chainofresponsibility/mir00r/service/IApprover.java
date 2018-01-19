/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility.mir00r.service;

import chainofresponsibility.mir00r.model.Employee;
import chainofresponsibility.mir00r.utility.Constant.Response;

/**
 *
 * @author Created by Mir00r
 */
public interface IApprover {

    public IApprover NextLeaveApprover(IApprover nextApprover);

    public Response LeaveApprove(Employee employee);

}
