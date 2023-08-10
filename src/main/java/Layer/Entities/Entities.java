package Layer.Entities;

public class Entities {
			private String id;
			private String name;
			private String pwd;
			private String mob;
			private String adhar;
			
			public Entities() {}

			public Entities( String id, String name, String pwd, String mob, String adhar) {
				super();
				this.id = id;
				this.name = name;
				this.pwd = pwd;
				this.mob = mob;
				this.adhar = adhar;
			}

			public String getId() {
				return id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getPwd() {
				return pwd;
			}

			public void setPwd(String pwd) {
				this.pwd = pwd;
			}

			public String getMob() {
				return mob;
			}

			public void setMob(String mob) {
				this.mob = mob;
			}

			public String getAdhar() {
				return adhar;
			}

			public void setAdhar(String adhar) {
				this.adhar = adhar;
			};

			
			
			
}
