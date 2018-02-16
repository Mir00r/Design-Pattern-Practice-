/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern.mir00r.iterator;

import iteratorpattern.mir00r.enumerator.ChannelCollection;
import iteratorpattern.mir00r.enumerator.ChannelIterator;
import iteratorpattern.mir00r.model.Channel;
import iteratorpattern.mir00r.utils.Constant;
import java.util.ArrayList;
import java.util.List;

/**
 * implementation of ChannelCollection interface so that the implementation
 * can’t be used by any other collection.
 *
 * @author Created by Mir00r
 */
public class ChannelCollectionImpl implements ChannelCollection {

    private List<Channel> channelList;

    public ChannelCollectionImpl() {
        channelList = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel channel) {
        this.channelList.add(channel);
    }

    @Override
    public void removeChannel(Channel channel) {
        this.channelList.remove(channel);
    }

    @Override
    public ChannelIterator iterateChannel(Constant.ChannelTypeEnum channelTypeEnum) {
        return new ChannelIteratorImpl(channelTypeEnum, this.channelList);
    }
}
