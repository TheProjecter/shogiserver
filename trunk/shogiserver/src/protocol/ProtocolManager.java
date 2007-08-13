/*
 * ProtocolManager.java
 * Copyright (C) 2007  Adrian Petrescu
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package protocol;

import connection.ClientInputMessage;
import connection.ClientOutputMessage;

/**
 *
 * @author Adrian Petrescu
 */
public class ProtocolManager {
    
    public static ProtocolManager getProtocolManager() {
        if (singleton != null) {
            return singleton;
        } else {
            return new ProtocolManager();
        }
    }
    
    private static ProtocolManager singleton;
    
    private ProtocolMap map;
    
    /** Creates a new instance of ProtocolManager */
    private ProtocolManager() {
        this.map = new ProtocolMap();
    }
    
}
