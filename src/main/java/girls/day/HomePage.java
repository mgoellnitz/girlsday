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
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 */
package girls.day;

import java.util.List;
import javax.jdo.annotations.Join;
import javax.jdo.annotations.PersistenceCapable;
import org.tangram.nucleus.Code;

@PersistenceCapable
public class HomePage extends Page {

    @Join
    private List<Page> bottomLinks;

    @Join
    private List<Code> css;

    @Join
    private List<Code> js;

    private Picture logo;


    public List<Page> getBottomLinks() {
        return this.bottomLinks;
    }


    public void setBottomLinks(List<Page> bottomLinks) {
        this.bottomLinks = bottomLinks;
    }


    public List<Code> getCss() {
        return this.css;
    }


    public void setCss(List<Code> css) {
        this.css = css;
    }


    public List<Code> getJs() {
        return this.js;
    }


    public void setJs(List<Code> js) {
        this.js = js;
    }


    public Picture getLogo() {
        return logo;
    }


    public void setLogo(Picture logo) {
        this.logo = logo;
    }


    @Override
    public HomePage getHomePage() {
        return this;
    } // getRootTopic()

} // RootTopic
