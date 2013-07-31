package org.odlabs.wiquery.tab;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.odlabs.wiquery.template.MainTemplate;

public class TabsPage extends MainTemplate {

	private static final long serialVersionUID = 1L;

	public TabsPage(final PageParameters parameters) {
		super(parameters);

		add(new TabsPanel("panel"));
	}

	@Override
	protected Class<? extends WebPage> getMenuPage() {
		return TabsPage.class;
	}
}