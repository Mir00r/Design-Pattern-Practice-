/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern.mir00r.enumerator;

import iteratorpattern.mir00r.model.Channel;

/**
 * Now our base interface and core classes are ready, let’s proceed with the
 * implementation of collection class and iterator.
 *
 * @author Created by Mir00r
 */
public interface ChannelIterator {

    public boolean hasNext();

    public Channel next();
}
