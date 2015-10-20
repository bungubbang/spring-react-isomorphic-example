var SiteList = React.createClass({
  getInitialState: function () {
    return this.props;
  },
  render: function () {
    var sites = this.state.sites.map(function ( site ) {
      return <Site name={ site.name } url={ site.url } key={ site.name } />
    });

    return (
      <ul className="site-list">
        { sites }
      </ul>
    )
  }
});