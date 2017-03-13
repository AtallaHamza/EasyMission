package marsoc.tn.EasyMission.presentation.mbeans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import java.util.List;

import javax.ejb.EJB;

import marsoc.tn.EasyMission.persistence.Service;
import marsoc.tn.EasyMission.services.IRemoteGestionService;
import marsoc.tn.EasyMission.services.IRemoteGestionUser;

@ManagedBean(name = "treeBasicView")
@ViewScoped
public class BasicVieww {
	private TreeNode root;
	@EJB
	IRemoteGestionService Gservice;
	Service s = new Service();

	public List<Service> getService() {
		return Gservice.recupereService();

	}

	@PostConstruct
	public void init() {

		root = new DefaultTreeNode("Service", null);
		for (Service k : Gservice.recupereService()) {

			TreeNode node0 = new DefaultTreeNode(k.getNom(), root);

			TreeNode node00 = new DefaultTreeNode(k.getDescription(), node0);

		}
	}

	public TreeNode getRoot() {
		return root;
	}

}
