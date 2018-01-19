/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility.mir00r.service_implemnet;

import chainofresponsibility.mir00r.model.Employee;
import chainofresponsibility.mir00r.service.IApprover;
import chainofresponsibility.mir00r.utility.Constant;
import chainofresponsibility.mir00r.utility.Constant.Response;

/**
 *
 * @author Created by Mir00r
 */
public class ResourceManager implements IApprover {

    private IApprover iApprover;

    @Override
    public IApprover NextLeaveApprover(IApprover approver) {
        this.iApprover = approver;
        return iApprover;
    }

    @Override
    public Response LeaveApprove(Employee employee) {
        if (employee.getDeys() >= 7) {
            return Response.APPROVED;
        }
//        return iApprover.LeaveApprove(employee);
        return Response.DENIED;
    }

}
