/**
 *
 * Copyright 2016 Martin Goellnitz
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 */
package girls.day;

import javax.jdo.annotations.PersistenceCapable;
import lombok.Getter;
import lombok.Setter;
import org.tangram.content.Content;
import org.tangram.nucleus.NucleusContent;


@PersistenceCapable
public abstract class WebStuff extends NucleusContent {

    // Exercies: Add a title for ever web stuff object here.
    @Getter
    @Setter
    private String keywords;


    @Override
    public int compareTo(Content o) {
        return (o instanceof WebStuff) ? ((keywords==null||((WebStuff) o).keywords==null) ? 0 : keywords
                .compareTo(((WebStuff) o).keywords)) : super.compareTo(o);
    } // compareTo()

} // WebStuff
