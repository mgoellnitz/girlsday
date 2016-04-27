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

import java.util.List;
import javax.jdo.annotations.NotPersistent;
import javax.jdo.annotations.PersistenceCapable;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.tangram.content.BeanFactory;
import org.tangram.content.BeanFactoryAware;


@Slf4j
@PersistenceCapable
public class Page extends WebStuff implements BeanFactoryAware {

    @Getter
    @Setter
    private List<Page> subPages;

    @Getter
    @Setter
    private List<Text> elements;

    @Getter
    @Setter
    private Picture thumbnail;

    private String teaser;

    @NotPersistent
    private BeanFactory beanFactory;

    @NotPersistent
    private HomePage rootTopic = null;


    @Override
    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }


    public char[] getTeaser() {
        return stringToCharArray(teaser);
    }


    public void setTeaser(char[] teaser) {
        this.teaser = charArrayToString(teaser);
    }



    /* ********************************* */
    public HomePage getHomePage() {
        if (rootTopic==null) {
            List<HomePage> rootTopics = beanFactory.listBeans(HomePage.class, null);
            if ((rootTopics!=null)&&(rootTopics.size()>0)) {
                rootTopic = rootTopics.get(0);
            } // if
        } // if
        return rootTopic;
    } // getRootTopic()

} // Page
