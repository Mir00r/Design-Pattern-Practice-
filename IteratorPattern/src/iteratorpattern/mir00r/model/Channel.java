/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern.mir00r.model;

import iteratorpattern.mir00r.utils.Constant;
import iteratorpattern.mir00r.utils.Constant.ChannelTypeEnum;

/**
 * Channel is a simple POJO class that has attributes frequency and channel
 * type.
 *
 * @author Created by Mir00r
 */
public class Channel {

    private double frequency;
    private ChannelTypeEnum channelTypeEnum;

    public Channel(double frequency, ChannelTypeEnum channelTypeEnum) {
        this.frequency = frequency;
        this.channelTypeEnum = channelTypeEnum;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public ChannelTypeEnum getChannelTypeEnum() {
        return channelTypeEnum;
    }

    public void setChannelTypeEnum(ChannelTypeEnum channelTypeEnum) {
        this.channelTypeEnum = channelTypeEnum;
    }

    @Override
    public String toString() {
        return "Channel{" + "frequency=" + frequency + ", channelTypeEnum=" + channelTypeEnum + '}';
    }
}
