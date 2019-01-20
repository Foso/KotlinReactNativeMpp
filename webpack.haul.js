module.exports = ({ platform }, defaults) => ({
  entry: `./shared/build/jsMain/shared.js`,
  module: {
    ...defaults.module,
    rules: [
      ...defaults.module.rules,
      {
        test: /\.js$/,
        use: ["source-map-loader"],
        enforce: "pre"
      }
    ]
  }
});