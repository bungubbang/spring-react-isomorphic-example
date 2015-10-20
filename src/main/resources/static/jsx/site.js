var Site = React.createClass({
    handleClick: function(event) {
      window.open(this.props.url);
    },
    render: function () {
        return (
              <li onClick={this.handleClick} >{ this.props.name }</li>
        )
    }
});