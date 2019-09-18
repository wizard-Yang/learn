package com.sjyang.设计模式.状态机;

import static com.sjyang.设计模式.状态机.Status.*;

/**
 * @author saijun.yang
 * @date Created in 2019/8/22 15:12
 * @description 年假事件流程演示
 * 年休假的审批流程:
 * 提交假单 PERMIT_SUBMIT
 * 领导审批 LEADER_PERMITING
 * 等待领导审批
 * 领导审批通过/不通过/拒绝
 * 领导审批通过    LEADER_PERMIT_AGREE
 * ceo审批 CEO_PERMITING
 * 等待ceo审批意见
 * ceo审批通过/不通过/拒绝
 * ceo审批通过 CEO_PERMIT_AGREE
 * 请假完成 PERMIT_SUCCESS
 * @modified By 5
 */
public class YearHolidayExample implements StatusMachine{
    @Override
    public Status getNextStatus(Status status, EventEnum eventEnum) {
        switch(status){
        case PERMIT_SUBMIT:
            //提交假单后，直接返回到领导审批状态
            return LEADER_PERMITING;
        case LEADER_PERMITING:
            //领导审批中，根据事件返回状态
            return getLeaderPermitionStatus(eventEnum);
        case LEADER_PERMIT_AGREE:
            //领导同意-ceo审批开始
            return CEO_PERMITING;
        case LEADER_PERMIT_DISAGREE:
            //领导不同意，请假失败
            return PERMIT_FAIL;
        case LEADER_PERMIT_MODIFY:
            return PERMIT_FAIL;
        case CEO_PERMITING:
            //ceo审批需要修改意见
            return getCEOPermitionStatus(eventEnum);
        case CEO_PERMIT_AGREE:
            //ceo同意，请假成功
            return PERMIT_SUCCESS;
        case CEO_PERMIT_DISAGREE:
            //ceo不同意
            return PERMIT_FAIL;
        case CEO_PERMIT_MODIFY:
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

    public Status getCEOPermitionStatus(EventEnum eventEnum){
        switch(eventEnum){
            case AGREE:
                return CEO_PERMIT_AGREE;
            case REFUSE:
                return CEO_PERMIT_DISAGREE;
            case MODIFY:
                return CEO_PERMIT_MODIFY;
                default:
                    throw new RuntimeException("不支持的事件类型"+eventEnum);
        }
    }
}
