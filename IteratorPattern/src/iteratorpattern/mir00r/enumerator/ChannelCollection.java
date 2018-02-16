/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern.mir00r.enumerator;

import iteratorpattern.mir00r.model.Channel;
import iteratorpattern.mir00r.utils.Constant;
import iteratorpattern.mir00r.utils.Constant.ChannelTypeEnum;

/**
 * ChannelCollection interface defines the contract for our collection class
 * implementation. Notice that there are methods to add and remove a channel but
 * there is no method that returns the list of channels and it has a method that
 * returns the iterator for traversal. ChannelIterator interface defines
 * following methods;
 *
 * @author Created by Mir00r
 */
public interface ChannelCollection {

    public void addChannel(Channel channel);

    public void removeChannel(Channel channel);

    public ChannelIterator iterateChannel(ChannelTypeEnum channelTypeEnum);
}
