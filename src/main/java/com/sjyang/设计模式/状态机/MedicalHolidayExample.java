package com.sjyang.设计模式.状态机;

import static com.sjyang.设计模式.状态机.Status.*;
import static com.sjyang.设计模式.状态机.Status.PERMIT_FAIL;

/**
 * @author saijun.yang
 * @date Created in 2019/8/22 15:59
 * @description 病假请假流程
 * 病假的审批流程：
 * 提交假单 PERMIT_SUBMIT
 * 领导审批 LEADER_PERMITING
 * 等待领导审批
 * 领导审批通过/不通过/拒绝
 * 领导审批通过 LEADER_PERMIT_AGREE
 * HR审批 HR_PERMITING
 * 等待HR审批意见
 * HR审批通过/不通过/拒绝
 * HR审批通过 CEO_PERMIT_AGREE
 * 请假完成 PERMIT_SUCCESS
 * 根据该流程不难设计出该状态机
 * @modified By 6
 */
public class MedicalHolidayExample implements StatusMachine{
    @Override
    public Status getNextStatus(Status status, EventEnum eventEnum) {
        switch (status) {
            case PERMIT_SUBMIT:
                //提交假单后，直接返回到领导审批状态
                return LEADER_PERMITING;
            case LEADER_PERMITING:
                //领导审批中，根据事件返回状态
                return getLeaderPermitionStatus(eventEnum);
            case LEADER_PERMIT_AGREE:
                //领导同意-ceo审批开始
                return HR_PERMITING;
            case LEADER_PERMIT_DISAGREE:
                //领导不同意，请假失败
                return PERMIT_FAIL;
            case LEADER_PERMIT_MODIFY:
                return PERMIT_FAIL;
            case HR_PERMITING:
                //ceo审批需要修改意见
                return getHRPermitionStatus(eventEnum);
            case HR_PERMIT_AGREE:
                //ceo同意，请假成功
                return PERMIT_SUCCESS;
            case HR_PERMIT_DISAGREE:
                //ceo不同意
                return PERMIT_FAIL;
            case HR_PERMIT_MODIFY:
                //ceo觉得要修改材料
                return PERMIT_FAIL;
            default:
                throw new RuntimeException("不支持的状态类型");
        }
    }

    public Status getLeaderPermitionStatus(EventEnum eventEnum){
        switch(eventEnum){
            case AGREE:
                return LEADER_PERMIT_AGREE;
            case REFUSE:
                return LEADER_PERMIT_DISAGREE;
            case MODIFY:
                return LEADER_PERMIT_MODIFY;
            default:
                throw new RuntimeException("不支持的事件类型"+eventEnum);
        }
    }

    public Status getHRPermitionStatus(EventEnum eventEnum){
        switch(eventEnum){
            case AGREE:
                return HR_PERMIT_AGREE;
            case REFUSE:
                return HR_PERMIT_DISAGREE;
            case MODIFY:
                return HR_PERMIT_MODIFY;
            default:
                throw new RuntimeException("不支持的事件类型"+eventEnum);
        }
    }
}
