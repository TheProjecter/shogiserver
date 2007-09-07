/*
 * UserList.java
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

package service.users;

/**
 *
 * @author Adrian Petrescu
 */
public class UserException extends java.lang.Exception {
    
    private UserList users;
    private String message;
    
    /**
     * Creates a new instance of <code>UserException</code> without detail message.
     */
    public UserException(UserList users, String message) {
        this.message = message;
        this.users = users;
    }

    public UserList getUsers() {
        return users;
    }
    
    public String getMessage() {
        return this.message;
    }
}