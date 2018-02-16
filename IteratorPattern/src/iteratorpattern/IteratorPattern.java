/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern;

import iteratorpattern.mir00r.enumerator.ChannelCollection;
import iteratorpattern.mir00r.enumerator.ChannelIterator;
import iteratorpattern.mir00r.enumerator.SocialNetworking;
import iteratorpattern.mir00r.iterator.ChannelCollectionImpl;
import iteratorpattern.mir00r.iterator.FacebookIterator;
import iteratorpattern.mir00r.iterator.TwitterIterator;
import iteratorpattern.mir00r.model.Channel;
import iteratorpattern.mir00r.utils.Constant.ChannelTypeEnum;

/**
 *
 * @author Created by Mir00r
 */
public class IteratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* System.out.println("Facebook users........");
        SocialNetworking iterator = new FacebookIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator = new TwitterIterator();
        System.out.println("Twitter users........");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        ChannelCollection channels = populateChannels();
        ChannelIterator baseIterator = channels.iterateChannel(ChannelTypeEnum.ALL);
        while (baseIterator.hasNext()) {
            Channel c = baseIterator.next();
            System.out.println(c.toString());
        }
        System.out.println("******");
        // Channel Type Iterator
        ChannelIterator englishIterator = channels.iterateChannel(ChannelTypeEnum.ENGLISH);
        while (englishIterator.hasNext()) {
            Channel c = englishIterator.next();
            System.out.println(c.toString());
        }
    }

    private static ChannelCollection populateChannels() {
        ChannelCollection channels = new ChannelCollectionImpl();

        channels.addChannel(new Channel(97.5, ChannelTypeEnum.BANGLA));
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));

        channels.addChannel(new Channel(96.5, ChannelTypeEnum.BANGLA));
        channels.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(102.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(103.5, ChannelTypeEnum.FRENCH));

        channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(106.5, ChannelTypeEnum.FRENCH));

        return channels;
    }

}
