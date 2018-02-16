/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern.mir00r.iterator;

import iteratorpattern.mir00r.enumerator.ChannelIterator;
import iteratorpattern.mir00r.model.Channel;
import iteratorpattern.mir00r.utils.Constant;
import iteratorpattern.mir00r.utils.Constant.ChannelTypeEnum;
import java.util.List;

/**
 * implementation of ChannelIterator interface so that the implementation can’t
 * be used by any other collection.
 *
 * @author Created by Mir00r
 */
public class ChannelIteratorImpl implements ChannelIterator {

    private ChannelTypeEnum channelTypeEnum;
    private List<Channel> channelsList;
    private int position;

    public ChannelIteratorImpl(ChannelTypeEnum channelTypeEnum, List<Channel> channelsList) {
        this.channelTypeEnum = channelTypeEnum;
        this.channelsList = channelsList;
    }

    @Override
    public boolean hasNext() {
        while (position < channelsList.size()) {
            Channel channel = channelsList.get(position);
            if (channel.getChannelTypeEnum().equals(channelTypeEnum) || channelTypeEnum.equals(Constant.ChannelTypeEnum.ALL)) {
                return true;
            } else {
                position++;
            }
        }
        return false;
    }

    @Override
    public Channel next() {
        Channel channel = channelsList.get(position);
        position++;
        return channel;
    }

}
