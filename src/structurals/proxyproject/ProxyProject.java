package structurals.proxyproject;

import java.util.Date;

public class ProxyProject implements Project {

    private String url;
    private RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {

        if (realProject == null) {
            realProject = new RealProject(url);
        }
        realProject.run();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ProxyProject that = (ProxyProject) o;

        if (url != null ? !url.equals(that.url) : that.url != null) {
            return false;
        }
        return realProject != null ? realProject.equals(that.realProject) : that.realProject == null;
    }

    @Override
    public int hashCode() {
        int result = url != null ? url.hashCode() : 0;
        result = 31 * result + (realProject != null ? realProject.hashCode() : 0);
        return result;
    }
}
