package converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.gov.pr.legislativo.entidades.Autor;

@FacesConverter(forClass = Autor.class,value="conversorAutor")
public class AutorConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if (value != null && !value.isEmpty()) {
            return (Autor) uiComponent.getAttributes().get(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        if (value instanceof Autor) {
            Autor entity= (Autor) value;
            if (entity != null && entity instanceof Autor && entity.getIdAutor() != null) {
                uiComponent.getAttributes().put( entity.getIdAutor() .toString(), entity);
                return entity.getIdAutor() .toString();
            }
        }
        return "";
    }
}