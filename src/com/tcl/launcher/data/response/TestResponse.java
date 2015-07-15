package com.tcl.launcher.data.response;

import java.util.ArrayList;

/**
 * @author chgang
 * @create time：2015-6-17 上午9:59:07
 */
public class TestResponse {

	String rc;
	String error;
	String question;
	String command;
	String semantic;
	String ad;
	String tips;
	Data data;
	
	
	
	/**
	 * data
	 */
	class Data {
		String domain;
		Result result;
		ArrayList<DynamicCommand> dynamicCommand;
		
		class Result {
			String tvplayId;
			String cnTitle;
			String enTitle;
			String directors;
			String screenwriter;
			String actors;
			String types;
			int season;
			int seasonNum;
			String seasonType;
			String tags;
			String language;
			String releasedate;
			String renames;
			String intro;
			String url;
			String cnSubTitle;
			String rating;
			String hot;
			String enSubTitle;
			String imghUrl;
			String imgvUrl;
			String sIntro;
			String sourceTvplayId;
			String finish;
			String updateStatus;
			String areas;
			String maxEpisode;
			String curEpisode;
			String sites;
			ArrayList<Recommends> recommends;
			ArrayList<Episodes> episodes;
			
			public String getTvplayId() {
				return tvplayId;
			}

			public void setTvplayId(String tvplayId) {
				this.tvplayId = tvplayId;
			}

			public String getCnTitle() {
				return cnTitle;
			}

			public void setCnTitle(String cnTitle) {
				this.cnTitle = cnTitle;
			}

			public String getEnTitle() {
				return enTitle;
			}

			public void setEnTitle(String enTitle) {
				this.enTitle = enTitle;
			}

			public String getDirectors() {
				return directors;
			}

			public void setDirectors(String directors) {
				this.directors = directors;
			}

			public String getScreenwriter() {
				return screenwriter;
			}

			public void setScreenwriter(String screenwriter) {
				this.screenwriter = screenwriter;
			}

			public String getActors() {
				return actors;
			}

			public void setActors(String actors) {
				this.actors = actors;
			}

			public String getTypes() {
				return types;
			}

			public void setTypes(String types) {
				this.types = types;
			}

			public int getSeason() {
				return season;
			}

			public void setSeason(int season) {
				this.season = season;
			}

			public int getSeasonNum() {
				return seasonNum;
			}

			public void setSeasonNum(int seasonNum) {
				this.seasonNum = seasonNum;
			}

			public String getSeasonType() {
				return seasonType;
			}

			public void setSeasonType(String seasonType) {
				this.seasonType = seasonType;
			}

			public String getTags() {
				return tags;
			}

			public void setTags(String tags) {
				this.tags = tags;
			}

			public String getLanguage() {
				return language;
			}

			public void setLanguage(String language) {
				this.language = language;
			}

			public String getReleasedate() {
				return releasedate;
			}

			public void setReleasedate(String releasedate) {
				this.releasedate = releasedate;
			}

			public String getRenames() {
				return renames;
			}

			public void setRenames(String renames) {
				this.renames = renames;
			}

			public String getIntro() {
				return intro;
			}

			public void setIntro(String intro) {
				this.intro = intro;
			}

			public String getUrl() {
				return url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public String getCnSubTitle() {
				return cnSubTitle;
			}

			public void setCnSubTitle(String cnSubTitle) {
				this.cnSubTitle = cnSubTitle;
			}

			public String getRating() {
				return rating;
			}

			public void setRating(String rating) {
				this.rating = rating;
			}

			public String getHot() {
				return hot;
			}

			public void setHot(String hot) {
				this.hot = hot;
			}

			public String getEnSubTitle() {
				return enSubTitle;
			}

			public void setEnSubTitle(String enSubTitle) {
				this.enSubTitle = enSubTitle;
			}

			public String getImghUrl() {
				return imghUrl;
			}

			public void setImghUrl(String imghUrl) {
				this.imghUrl = imghUrl;
			}

			public String getImgvUrl() {
				return imgvUrl;
			}

			public void setImgvUrl(String imgvUrl) {
				this.imgvUrl = imgvUrl;
			}

			public String getsIntro() {
				return sIntro;
			}

			public void setsIntro(String sIntro) {
				this.sIntro = sIntro;
			}

			public String getSourceTvplayId() {
				return sourceTvplayId;
			}

			public void setSourceTvplayId(String sourceTvplayId) {
				this.sourceTvplayId = sourceTvplayId;
			}

			public String getFinish() {
				return finish;
			}

			public void setFinish(String finish) {
				this.finish = finish;
			}

			public String getUpdateStatus() {
				return updateStatus;
			}

			public void setUpdateStatus(String updateStatus) {
				this.updateStatus = updateStatus;
			}

			public String getAreas() {
				return areas;
			}

			public void setAreas(String areas) {
				this.areas = areas;
			}

			public String getMaxEpisode() {
				return maxEpisode;
			}

			public void setMaxEpisode(String maxEpisode) {
				this.maxEpisode = maxEpisode;
			}

			public String getCurEpisode() {
				return curEpisode;
			}

			public void setCurEpisode(String curEpisode) {
				this.curEpisode = curEpisode;
			}

			public String getSites() {
				return sites;
			}

			public void setSites(String sites) {
				this.sites = sites;
			}

			public ArrayList<Recommends> getRecommends() {
				return recommends;
			}

			public void setRecommends(ArrayList<Recommends> recommends) {
				this.recommends = recommends;
			}

			public ArrayList<Episodes> getEpisodes() {
				return episodes;
			}

			public void setEpisodes(ArrayList<Episodes> episodes) {
				this.episodes = episodes;
			}

			class Recommends{
				String id;
				String title;
				String img;
				String domain;
				String cmd;
				String subTitle;
				ArrayList<Pars> pars;
				public String getId() {
					return id;
				}
				public void setId(String id) {
					this.id = id;
				}
				public String getTitle() {
					return title;
				}
				public void setTitle(String title) {
					this.title = title;
				}
				public String getImg() {
					return img;
				}
				public void setImg(String img) {
					this.img = img;
				}
				public String getDomain() {
					return domain;
				}
				public void setDomain(String domain) {
					this.domain = domain;
				}
				public String getCmd() {
					return cmd;
				}
				public void setCmd(String cmd) {
					this.cmd = cmd;
				}
				public String getSubTitle() {
					return subTitle;
				}
				public void setSubTitle(String subTitle) {
					this.subTitle = subTitle;
				}
				public ArrayList<Pars> getPars() {
					return pars;
				}
				public void setPars(ArrayList<Pars> pars) {
					this.pars = pars;
				}
				
			}
			
			class Episodes{
				String singleTitle;
				String url;
				String episode;
				String thumbnail;
				String playUrl;
				String type;
				ArrayList<Sites> sites;
				
				
				
				public String getSingleTitle() {
					return singleTitle;
				}



				public void setSingleTitle(String singleTitle) {
					this.singleTitle = singleTitle;
				}



				public String getUrl() {
					return url;
				}



				public void setUrl(String url) {
					this.url = url;
				}



				public String getEpisode() {
					return episode;
				}



				public void setEpisode(String episode) {
					this.episode = episode;
				}



				public String getThumbnail() {
					return thumbnail;
				}



				public void setThumbnail(String thumbnail) {
					this.thumbnail = thumbnail;
				}



				public String getPlayUrl() {
					return playUrl;
				}



				public void setPlayUrl(String playUrl) {
					this.playUrl = playUrl;
				}



				public String getType() {
					return type;
				}



				public void setType(String type) {
					this.type = type;
				}



				public ArrayList<Sites> getSites() {
					return sites;
				}



				public void setSites(ArrayList<Sites> sites) {
					this.sites = sites;
				}



				class Sites{
					String siteOrder;
					String siteUrl;
					String siteLogo;
					String siteName;
					String url;
					String playUrl;
					String type;
					public String getSiteOrder() {
						return siteOrder;
					}
					public void setSiteOrder(String siteOrder) {
						this.siteOrder = siteOrder;
					}
					public String getSiteUrl() {
						return siteUrl;
					}
					public void setSiteUrl(String siteUrl) {
						this.siteUrl = siteUrl;
					}
					public String getSiteLogo() {
						return siteLogo;
					}
					public void setSiteLogo(String siteLogo) {
						this.siteLogo = siteLogo;
					}
					public String getSiteName() {
						return siteName;
					}
					public void setSiteName(String siteName) {
						this.siteName = siteName;
					}
					public String getUrl() {
						return url;
					}
					public void setUrl(String url) {
						this.url = url;
					}
					public String getPlayUrl() {
						return playUrl;
					}
					public void setPlayUrl(String playUrl) {
						this.playUrl = playUrl;
					}
					public String getType() {
						return type;
					}
					public void setType(String type) {
						this.type = type;
					}
					
					
				}
				
			}
		}
		
		class DynamicCommand{
			String statement;
			String command;
			ArrayList<Pars> pars;
			String matchtype;
			public String getStatement() {
				return statement;
			}
			public void setStatement(String statement) {
				this.statement = statement;
			}
			public String getCommand() {
				return command;
			}
			public void setCommand(String command) {
				this.command = command;
			}
			public ArrayList<Pars> getPars() {
				return pars;
			}
			public void setPars(ArrayList<Pars> pars) {
				this.pars = pars;
			}
			public String getMatchtype() {
				return matchtype;
			}
			public void setMatchtype(String matchtype) {
				this.matchtype = matchtype;
			}
			
			
		}
		
		class Pars{
			String key;
			String value;
			public String getKey() {
				return key;
			}
			public void setKey(String key) {
				this.key = key;
			}
			public String getValue() {
				return value;
			}
			public void setValue(String value) {
				this.value = value;
			}
			
			
		}

		public String getDomain() {
			return domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public Result getResult() {
			return result;
		}

		public void setResult(Result result) {
			this.result = result;
		}

		public ArrayList<DynamicCommand> getDynamicCommand() {
			return dynamicCommand;
		}

		public void setDynamicCommand(ArrayList<DynamicCommand> dynamicCommand) {
			this.dynamicCommand = dynamicCommand;
		}
		
	}



	public String getRc() {
		return rc;
	}



	public void setRc(String rc) {
		this.rc = rc;
	}



	public String getError() {
		return error;
	}



	public void setError(String error) {
		this.error = error;
	}



	public String getQuestion() {
		return question;
	}



	public void setQuestion(String question) {
		this.question = question;
	}



	public String getCommand() {
		return command;
	}



	public void setCommand(String command) {
		this.command = command;
	}



	public String getSemantic() {
		return semantic;
	}



	public void setSemantic(String semantic) {
		this.semantic = semantic;
	}



	public String getAd() {
		return ad;
	}



	public void setAd(String ad) {
		this.ad = ad;
	}



	public String getTips() {
		return tips;
	}



	public void setTips(String tips) {
		this.tips = tips;
	}



	public Data getData() {
		return data;
	}



	public void setData(Data data) {
		this.data = data;
	}
	
	
}
